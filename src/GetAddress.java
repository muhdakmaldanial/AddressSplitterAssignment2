/**
 *
 * @author muhdakmaldanial
 */
public class GetAddress {

    public final String aptNum;
    public final String city;
    public final String state;
    public final String postCode;
    public final String street;
    public final String section;

    public GetAddress(String addressString) {
        final String[] aptNumExtractedComps = AptNumber.INSTANCE.getAddressComponent(addressString);
        this.aptNum = aptNumExtractedComps[0];
        addressString = aptNumExtractedComps[1];

        final String[] cityExtractedComps = City.INSTANCE.getAddressComponent(addressString);
        this.city = cityExtractedComps[0];
        addressString = cityExtractedComps[1];

        final String[] stateExtractedComps = State.INSTANCE.getAddressComponent(addressString);
        this.state = stateExtractedComps[0];
        addressString = stateExtractedComps[1];

        final String[] postCodeExtractedComps = PostCode.INSTANCE.getAddressComponent(addressString);
        this.postCode = postCodeExtractedComps[0];
        addressString = postCodeExtractedComps[1];

        final String[] streetExtractedComps = Street.INSTANCE.getAddressComponent(addressString);
        this.street = streetExtractedComps[0];
        addressString = streetExtractedComps[1];

        final String[] sectionExtractedComps = Section.INSTANCE.getAddressComponent(addressString);
        this.section = sectionExtractedComps[0];
    }
}
