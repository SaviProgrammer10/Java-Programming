import java.util.ArrayList;

class MemberInfo {
    private String name;
    private int gradYear;
    private boolean goodStanding;

    public MemberInfo(String name, int gradYear, boolean goodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.goodStanding = goodStanding;
    }

    public String getName() {
        return name;
    }

    public int getGradYear() {
        return gradYear;
    }

    public boolean inGoodStanding() {
        return goodStanding;
    }

    @Override
    public String toString() {
        return name + " | Graduation Year: " + gradYear + " | Good Standing: " + goodStanding;
    }
}

public class ClubMembers {

    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        memberList = new ArrayList<>();
    }

    // Part (a): Add new members
    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            memberList.add(new MemberInfo(name, gradYear, true));
        }
    }

    // Part (b): Remove graduated members
    public ArrayList<MemberInfo> removeMembers(int year) {

        ArrayList<MemberInfo> graduatedMembers = new ArrayList<>();

        int i = 0;

        while (i < memberList.size()) {

            MemberInfo member = memberList.get(i);

            if (member.getGradYear() <= year) {

                if (member.inGoodStanding()) {
                    graduatedMembers.add(member);
                }

                memberList.remove(i);
            } else {
                i++;
            }
        }

        return graduatedMembers;
    }

    // Display all members
    public void displayMembers() {
        if (memberList.isEmpty()) {
            System.out.println("No members in the club.");
            return;
        }

        for (MemberInfo member : memberList) {
            System.out.println(member);
        }
    }

    // Main Method
    public static void main(String[] args) {

        ClubMembers club = new ClubMembers();

        // Adding members
        String[] names1 = {"SMITH, JANE", "FOX, STEVE", "XIN, MICHAEL", "GARCIA, MARIA"};

        club.addMembers(names1, 2019);

        // Add another batch
        String[] names2 = {"JOHN", "EMMA"};
        club.addMembers(names2, 2021);

        System.out.println("===== Members Before Removal =====");
        club.displayMembers();

        // Remove graduated members
        ArrayList<MemberInfo> graduated = club.removeMembers(2019);

        System.out.println("\n===== Graduated Members (Good Standing) =====");
        if (graduated.isEmpty()) {
            System.out.println("No graduated members.");
        } else {
            for (MemberInfo member : graduated) {
                System.out.println(member);
            }
        }

        System.out.println("\n===== Remaining Members =====");
        club.displayMembers();
    }
}