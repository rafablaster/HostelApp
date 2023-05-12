import hostelapp.hostel.Address;
import hostelapp.hostel.Guest;

public class GuestTest {
    public static void main(String[] args) {

        Guest florentino = new Guest();
        florentino.setName("Florentino");
        florentino.setLastName("Ariza");

        /*
        * Date
        * */

        Address address = new Address();
        address.setAddress("Rua Joaquim Lázaro Gomes");
        address.setCity("Alfenas");
        address.setZipCode("37130-000");
        address.setState("MG");
        address.setCountry("Brazil");

        florentino.setAddress(address);

        Address florentinoAddress = florentino.getAddress();
        String city = florentinoAddress.getCity();













        Guest fermina = new Guest();
        fermina.setName("Fermina");
        fermina.setLastName("Daza");

        Guest atticus = new Guest("Atticus", "Finch");

        Guest gregor = new Guest("Gregor");
        gregor.setLastName("Samsa");


        //impressão na tela

        System.out.println("Name...: " + florentino.getName());
        System.out.println("Last name...: " + florentino.getLastName());
        System.out.println("Address...: " + florentino.getAddress().getAddress());
        //System.out.println("Email...:" + florentino.getEmail() );
        //System.out.println("Birthdate...:" + florentino.getBirthday().getBirthdayFormattedAsString());
        System.out.println("City....: " + city);
        System.out.println("State...: " + florentino.getAddress().getState());
        System.out.println("Zip Code..: " + florentino.getAddress().getZipCode());
        System.out.println("Country..: " + florentino.getAddress().getCountry());

        System.out.println();
        System.out.println("Name...: " + fermina.getName());
        System.out.println("Last name...: " + fermina.getLastName());

        System.out.println();
        System.out.println("Name...: " + atticus.getName());
        System.out.println("Last name...: " + atticus.getLastName());

        System.out.println();
        System.out.println("Name...: " + gregor.getName());
        System.out.println("Last name...: " + gregor.getLastName());

    }
}

