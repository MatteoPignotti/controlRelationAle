package it.nexi.control_relation.batch.dao;


import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static DbConnection	instance	= null;
	private Connection			connection	= null;

	/**
	 *Classe di connessione al Database
	 */
	public static DbConnection getInstance() {
		return instance != null ? instance : new DbConnection();
	}
	final Logger logger = Logger.getLogger(DbConnection.class);

	/**
	 *Metodo che restituisce l'oggetto Connection creato con la connessione al Database
	 */
	public Connection getConnection() {
		return this.connection;
	}

	/**
	 *metodo per la creazione della connessione al Database
	 * @param  host nome host a cui collegarsi
	 * @param  user identificativo utente con il quale si farà l'accesso al Database
	 * @param pass password udente
	 */
	public Connection open(String host, String user, String pass) {
		if (connection == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection(host, user, pass);
				//connection.setAutoCommit(false);
			} catch (ClassNotFoundException | SQLException e) {
				logger.error("Errore di connessione/apertura ----> Error: " + e);
				System.exit(-1);
			}
		}
		return connection;
	}

	public void close() {
		try {
			if (connection != null) {
				connection.close();
				connection = null;
			}
		} catch (SQLException e) {
			logger.error("Error: " + e);
		}
	}


}