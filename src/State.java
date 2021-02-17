import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author muhdakmaldanial
 */
public class State implements AddressExtractComponent {

    private static final Pattern pattern = Pattern.compile("(Selangor|selangor|Terengganu|terengganu|Pahang|pahang|Kelantan|kelantan|Melaka|melaka|"
            + "Pulau Pinang|pulau pinang|Pulau pinang|pulau Pinang|Kedah|kedah|Johor|johor|Perlis|perlis|Sabah|sabah|Sarawak|sarawak)");
    public static final State INSTANCE = new State();

    private State() {
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
