/**
 *
 * @author muhdakmaldanial
 */
public class DisplayAddress {

    public void display(String input) {

        GetAddress address = new GetAddress(input);
        String aptNum = address.aptNum;
        String city = address.city;
        String state = address.state;
        String postCode = address.postCode;
        String street = address.street;
        String section = address.section;

        if (aptNum != null || street != null || section != null || city != null || state != null || postCode
                != null) {
            System.out.println("Output: \n" + "{");

            if (aptNum != null) {
                System.out.println("'apt': " + "'" + aptNum + "',");
            }
            if (street != null) {
                System.out.println("'street': " + "'" + street + "',");
            }
            if (city != null) {
                System.out.println("'city': " + "'" + city + "',");
            }
            if (state != null) {
                System.out.println("'state': " + "'" + state + "',");
            }
            if (postCode != null) {
                System.out.println("'postcode': " + "'" + postCode + "',");
            }
            if (section != null) {
                System.out.println("'section': " + "'" + section + "',");
            }
            System.out.println("}");
        }
    }
}
