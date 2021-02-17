import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author muhdakmaldanial
 */
public class City implements AddressExtractComponent {

    private static final Pattern pattern = Pattern.compile("(Kuala Terengganu|kuala terengganu|Kuala terengganu|kuala terengganu|"
            + "Kuala Lumpur|kuala lumpur|Kuala lumpur|kuala Lumpur|Kajang|kajang|Bangi|bangi|Damansara|damansara| "
            + "Petaling Jaya|petaling jaya|Petaling jaya|petaling Jaya|Puchong|puchong|Cyberjaya|cyberjaya"
            + "Subang Jaya|subang jaya|Subang jaya|subang Jaya|Putrajaya|putrajaya|Mantin|mantin|Kuching|kuching|Seremban|seremban)");
    public static final City INSTANCE = new City();

    private City() {
    }

    @Override
    public String[] getAddressComponent(String address) {
        final String[] components = new String[2];
        Matcher m = pattern.matcher(address);
        if (m.find()) {
            components[0] = m.group(0);
            final String others = address.replace(m.group(0), "");
            components[1] = others;
        } else {
            components[0] = null;
            components[1] = address;
        }
        return components;
    }
}
