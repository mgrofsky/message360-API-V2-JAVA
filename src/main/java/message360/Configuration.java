/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/08/2016
 */
package message360;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import message360.models.*;

public class Configuration {
    //The username to use with basic authentication
    //TODO: Replace the basicAuthUserName with an appropriate value
    public static String basicAuthUserName = "TODO: Replace";

    //The password to use with basic authentication
    //TODO: Replace the basicAuthPassword with an appropriate value
    public static String basicAuthPassword = "TODO: Replace";

    /**
     * Current API environment
     */
    public static Environments environment = Environments.PRODUCTION;

    /**
     * Get base URI by current environment
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public static String getBaseUri(Servers server) {
        StringBuilder baseUrl = new StringBuilder(environmentsMap.get(Configuration.environment).get(server));
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4938632999935940816L;
            {
            }
        };
        APIHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }
    
    /**
     * Get base URI by current environment
     * @return Processed base URI
     */
    public static String getBaseUri() {
        return Configuration.getBaseUri(Servers.DEFAULT);
    }
    
    /**
     * Map of all base URLs by environments and server aliases 
     */
    private static EnumMap<Environments, EnumMap<Servers, String>> environmentsMap = new EnumMap<Environments, EnumMap<Servers,String>>(Environments.class) {
        private static final long serialVersionUID = 4958540823700565351L;
        {
            put(Environments.PRODUCTION , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 5024299452091542650L;
                {
                    put(Servers.DEFAULT, "https://api.message360.com/api/v2");
                }
            });
            put(Environments.PREPRODUCTION , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 4928248691287465999L;
                {
                    put(Servers.DEFAULT, "https://api-preprod.message360.com/api/v2");
                }
            });
            put(Environments.DEVELOPMENT , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 5067117381775415344L;
                {
                    put(Servers.DEFAULT, "https://api-dev.message360.com/api/v2");
                }
            });
        }
    };
}
