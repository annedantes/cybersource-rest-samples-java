package Data;

import java.util.Properties;

public class Configuration {
	public static Properties getMerchantDetails() {
		Properties props = new Properties();

		// HTTP_Signature = http_signature and JWT = jwt
		props.setProperty("authenticationType", "http_signature");
		props.setProperty("merchantID", "testvisa_1778041793");
		props.setProperty("runEnvironment", "apitest.cybersource.com");
		props.setProperty("requestJsonPath", "src/main/resources/request.json");

		// MetaKey Parameters
		props.setProperty("portfolioID", "");
		props.setProperty("useMetaKey", "false");

		// JWT Parameters
		props.setProperty("keyAlias", "testrest");
		props.setProperty("keyPass", "testrest");
		props.setProperty("keyFileName", "testrest");

		// P12 key path. Enter the folder path where the .p12 file is located.

		props.setProperty("keysDirectory", "src/main/resources");
		// HTTP Parameters
		props.setProperty("merchantKeyId", "8bb6a685-c06f-4087-909f-718dcee2ac54");
		props.setProperty("merchantsecretKey", "RM6fxo7ZhK3qXpPj48nLbuqIpeyJPW3Yp8A+lTirXKQ=");
		// Logging to be enabled or not.
		props.setProperty("enableLog", "true");
		// Log directory Path
		props.setProperty("logDirectory", "log");
		props.setProperty("logFilename", "cybs");

		// Log file size in KB
		props.setProperty("logMaximumSize", "5M");

		// OAuth related properties.
		props.setProperty("enableClientCert", "false");
		props.setProperty("clientCertDirectory", "src/main/resources");
		props.setProperty("clientCertFile", "");
		props.setProperty("clientCertPassword", "");
		props.setProperty("clientId", "");
		props.setProperty("clientSecret", "");

		/*
		PEM Key file path for decoding JWE Response Enter the folder path where the .pem file is located.
		It is optional property, require adding only during JWE decryption.
		*/
		props.setProperty("jwePEMFileDirectory", "src/main/resources/NetworkTokenCert.pem");
		
		//Add the property if required to override the cybs default developerId in all request body
		props.setProperty("defaultDeveloperId", "");

		return props;

	}
	
	public static Properties getAlternativeMerchantDetails() {
		Properties props = new Properties();

		// HTTP_Signature = http_signature and JWT = jwt
		props.setProperty("authenticationType", "http_signature");
		props.setProperty("merchantID", "testvisa_1778041793");
		props.setProperty("runEnvironment", "apitest.cybersource.com");
		props.setProperty("requestJsonPath", "src/main/resources/request.json");

		// JWT Parameters
		props.setProperty("keyAlias", "testrest_cpctv");
		props.setProperty("keyPass", "testrest_cpctv");
		props.setProperty("keyFileName", "testrest_cpctv");

		// P12 key path. Enter the folder path where the .p12 file is located.

		props.setProperty("keysDirectory", "src/main/resources");
		// HTTP Parameters
		props.setProperty("merchantKeyId", "8bb6a685-c06f-4087-909f-718dcee2ac54");
		props.setProperty("merchantsecretKey", "RM6fxo7ZhK3qXpPj48nLbuqIpeyJPW3Yp8A+lTirXKQ=");
		// Logging to be enabled or not.
		props.setProperty("enableLog", "true");
		// Log directory Path
		props.setProperty("logDirectory", "log");
		props.setProperty("logFilename", "cybs");

		// Log file size in KB
		props.setProperty("logMaximumSize", "5M");

		return props;

	}
	
	public static Properties getMerchantDetailsForBatchUploadSample() {
		Properties props = new Properties();

		// HTTP_Signature = http_signature and JWT = jwt
		props.setProperty("authenticationType", "jwt");
		props.setProperty("merchantID", "testvisa_1778041793");
		props.setProperty("runEnvironment", "apitest.cybersource.com");
		props.setProperty("requestJsonPath", "src/main/resources/request.json");

		// MetaKey Parameters
		props.setProperty("portfolioID", "");
		props.setProperty("useMetaKey", "false");

		// JWT Parameters
		props.setProperty("keyAlias", "qaebc2");
		props.setProperty("keyPass", "?Test1234");
		props.setProperty("keyFileName", "qaebc2");

		// P12 key path. Enter the folder path where the .p12 file is located.

		props.setProperty("keysDirectory", "src/main/resources");
		
		// Logging to be enabled or not.
		props.setProperty("enableLog", "true");
		// Log directory Path
		props.setProperty("logDirectory", "log");
		props.setProperty("logFilename", "cybs");

		// Log file size in KB
		props.setProperty("logMaximumSize", "5M");

		// OAuth related properties.
		props.setProperty("enableClientCert", "false");
		props.setProperty("clientCertDirectory", "src/main/resources");
		props.setProperty("clientCertFile", "");
		props.setProperty("clientCertPassword", "");
		props.setProperty("clientId", "");
		props.setProperty("clientSecret", "");

		
		
		//Add the property if required to override the cybs default developerId in all request body
		props.setProperty("defaultDeveloperId", "");

		return props;

	}
	
}
