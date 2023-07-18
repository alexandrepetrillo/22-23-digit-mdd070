package observator.stock;

public class Main {

    public static void main(String[] args) {
        Magasin magasin = new Magasin();

        Client client1 = new Client();
        Client client2 = new Client();
        magasin.subscribe(client1);
        magasin.subscribe(client2);

        Professionnel pro = new Professionnel();
        magasin.subscribe(pro);

        magasin.receptionner(10);
        magasin.receptionner(2);

        SiteInternet siteInternet = new SiteInternet();
        siteInternet.subscribe(client1);

    }
}
