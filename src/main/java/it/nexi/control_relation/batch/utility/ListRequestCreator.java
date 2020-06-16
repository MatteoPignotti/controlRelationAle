package it.nexi.control_relation.batch.utility;

import it.nexi.control_relation.batch.tableEntity.TableEntityTite;
import io.swagger.client.model.*;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**Classe che trasforma una lista di TableEntityTite in una lista di Request da mandare all'API_CLIENT.
 * Differenziazione tra ditta individuale e company attraverso la lunghezza del FISCAL CODE
 */
public class ListRequestCreator {

    final static Logger logger = Logger.getLogger(ListRequestCreator.class);

    private static ListRequestCreator	ListRequestCreator;
    public static ListRequestCreator getInstance() {
        return null == ListRequestCreator ? new ListRequestCreator() : ListRequestCreator;
    }
    public ListRequestCreator(){
    }

    /**Metodo che trasforma una lista di TableEntityTite in una lista di Request da mandare all'API_CLIENT.
     * Differenziazione tra ditta individuale e company attraverso la lunghezza del FISCAL CODE
     * @param tbList List<TableEntityTite>
    * @return List<GetCompanyReliabilityReportRequest>*/
    public List<GetCompanyReliabilityReportRequest> createListRequest(List<TableEntityTite> tbList){
        logger.info("inizio conversione TableEntityTite---->Request");
        List<GetCompanyReliabilityReportRequest> getCompanyList = new ArrayList<>();
        for(int i = 0; i< tbList.size();i++){
            GetCompanyReliabilityReportRequest  temp = new GetCompanyReliabilityReportRequest();
            Address address = new Address();
            address.setProvince(tbList.get(i).getCo_prov());
            address.setStreetNumber("");address.setStreet("");address.setPostalCode("00000");address.setNation("");address.setCity("");
            List<Address> listaddr = new ArrayList<>();
            listaddr.add(address);
            temp.setAddresses(listaddr);
            temp.setReportTypeCode("FGold");
            if(tbList.get(i).getCo_fis_soc().length()>11) {//DITTA INDIVIDUALE
                IndividualCompanyData icd = new IndividualCompanyData();
                icd.setFiscalCode(tbList.get(i).getCo_fis_soc());
                temp.setIndividualCompanyData(icd);
                temp.setCompanyData(null);
            }else{
                CompanyBasicData cbd = new CompanyBasicData();
                cbd.setRsd("");cbd.setReaCode("");cbd.setCciaaProvince("");
                cbd.setFiscalCode(tbList.get(i).getCo_fis_soc());
                temp.setCompanyData((cbd));
                temp.setIndividualCompanyData(null);
            }
            getCompanyList.add(temp);
        }
        return getCompanyList;
    }
}

