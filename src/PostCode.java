import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author muhdakmaldanial
 */
public class PostCode implements AddressExtractComponent {

    private static final Pattern pattern = Pattern.compile("([0-9]{5}|[0-9]{4})");
    public static final PostCode INSTANCE = new PostCode();

    private PostCode() {
    }

    @Override
    public String[] getAddressComponent(String address) {
        final String[] components = new String[2];
        Matcher m = pattern.matcher(address);
        if (m.find()) {
            Integer i = Integer.valueOf(m.group(0));
            if (i >= 1000 && i <= 98859) {
                components[0] = i.toString();
                final String others = address.replace(i.toString(), "");
                components[1] = others;
            } else {
                components[0] = null;
                components[1] = address;
            }
        } else {
            components[0] = null;
            components[1] = address;
        }
        return components;
    }
}
