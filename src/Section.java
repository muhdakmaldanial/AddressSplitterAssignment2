/**
 *
 * @author muhdakmaldanial
 */
public class Section implements AddressExtractComponent {

    public static final Section INSTANCE = new Section();

    private Section() {
    }

    @Override
    public String[] getAddressComponent(String address) {
        final String[] components = new String[1];
        address = address.replace(" ", "").replace(",", "");
        if (address != null && !"".equals(address)) {
            components[0] = address.trim().replace(",", "");
        } else {
            components[0] = null;
        }
        return components;
    }
}
