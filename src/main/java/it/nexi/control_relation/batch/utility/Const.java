package it.nexi.control_relation.batch.utility;

public final class Const {
	private Const() {
	}

	public static class PropertyKey {
		private PropertyKey() {
		}
		public static final String	ARCHIVE_OUTPUT_PASS					= "archive.output.pass";
		public static final String	VERIFYING_SSL						= "verifying.ssl.active";
		public static final String	AML_SENDER_MAIL_ADDRESS				= "aml.sender.mail.address";
		public static final String	AML_TO_RECEIVING_MAIL_ADDRESSES		= "aml.receiving.to.mail.addresses";
		public static final String	AML_CC_RECEIVING_MAIL_ADDRESSES		= "aml.receiving.cc.mail.addresses";
		public static final String	AML_MAIL_ALIAS						= "aml.mail.alias";
		public static final String	AML_MAIL_SUBJECT					= "aml.mail.subject";
		public static final String	AML_MAIL_BODY						= "aml.mail.body";
		public static final String	IAM_SENDER_MAIL_ADDRESS				= "iam.sender.mail.address";
		public static final String	IAM_TO_RECEIVING_MAIL_ADDRESSES		= "iam.receiving.to.mail.addresses";
		public static final String	IAM_CC_RECEIVING_MAIL_ADDRESSES		= "iam.receiving.cc.mail.addresses";
		public static final String	IAM_MAIL_ALIAS						= "iam.mail.alias";
		public static final String	IAM_MAIL_SUBJECT					= "iam.mail.subject";
		public static final String	IAM_MAIL_BODY						= "iam.mail.body";
		public static final String	DATABASE_ERROR_MSG					= "Database error: ";
		public static final String	SEMICOLON							= ";";
		public static final String	UNDERSCORE							= "_";
	}

	public static class SendMailKeyConstants {
		private SendMailKeyConstants() {
		}
		public static final String	MT_APPLICATION		= "mtservices.notification.sendmail.application";
		public static final String	MT_CHANNEL			= "mtservices.notification.sendmail.channel";
		public static final String	MT_COMPANY_GROUP	= "mtservices.notification.sendmail.company_group";
		public static final String	MT_COMPANY			= "mtservices.notification.sendmail.company";
		public static final String	MT_PARTNER			= "mtservices.notification.sendmail.partner";
		public static final String	MT_USER				= "mtservices.notification.sendmail.user";
		public static final String	MT_REQUEST_ID		= "mtservices.notification.sendmail.request_id";
		public static final String	MT_SESSION_ID		= "mtservices.notification.sendmail.session_id";
		public static final String	MTSERVICES_NOTIFICATION_ENDPOINT	= "endpoint.mtservices.notification.sendmail";
	}

    public static class FileExtensionType {
        private FileExtensionType() {
        }
        public static final String CSV = ".csv";
    }
}
