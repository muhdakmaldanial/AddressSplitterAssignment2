import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author muhdakmaldanial
 */
public class Street implements AddressExtractComponent {

    private static final Pattern pattern = Pattern.compile("(Jalan|Jln|Lorong|Persiaran|jalan|jln|lorong|persiaran)((\\s\\w+\\s\\w+)|(\\s\\w+))");
    public static final Street INSTANCE = new Street();

    private Street() {
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
