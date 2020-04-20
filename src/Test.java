import java.net.*;

class Test {

    public static void main(String args[]) throws UnknownHostException {
        String url = "ldap://[34:45::1]:10389";
        URI uri = null;
        try {
            uri = new URI(url);
        }catch (URISyntaxException e){
            throw new IllegalArgumentException("Invalid LDAP URL: " + url);
        }
        int port = uri.getPort();
        String hostname = uri.getHost();
        String scheme = uri.getScheme();

        System.out.println("port: " + port + " hostname: "+hostname + "scheme: "+ scheme);

        InetAddress address = InetAddress.getByName(hostname);

        if (address instanceof Inet6Address) {
            System.out.println("ipv6");
            System.out.println(hostname);
        }



    }


} 