import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author muhdakmaldanial
 */
public class AptNumber implements AddressExtractComponent {

    private static final Pattern pattern = Pattern.compile("((No)|(No.)|(no)|(no.))((\\d+)|\\s)(\\d+|\\w+|\\d+[a-zA-Z])");
    public static final AptNumber INSTANCE = new AptNumber();

    private AptNumber() {
    }

    @Override
    public String[] getAddressComponent(String address) {
        final String[] components = new String[2];
        Matcher m = pattern.matcher(address);
        if (m.find()) {
            components[0] = m.group(0);
            final String others = address.replace(m.group(0), "").replace(".", "");
            components[1] = others;
        } else {
            components[0] = null;
            components[1] = address;
        }
        return components;
    }
}
