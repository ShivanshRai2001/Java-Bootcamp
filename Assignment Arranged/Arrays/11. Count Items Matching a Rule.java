public class Practice2 {
    public static void main(String[] args) {
        // String[][] items = {{"phone", "blue", "pixel"}, {"computer", "silver", "phone"}, {"phone", "gold", "iphone"}};
        // String rulekey = "type";
        // String ruleValue = "phone";

        String[][] items = {{"phone", "blue", "pixel"}, {"computer", "silver", "lenovo"}, {"phone", "gold", "iphone"}};
        String rulekey = "color";
        String ruleValue = "silver";

        int ans = 0;

        if(rulekey == "type") {
            for(int i=0; i<items.length; i++) {
                if(ruleValue == items[i][0]) {
                    ans++;
                }
            }
        }

        if(rulekey == "color") {
            for(int i=0; i<items.length; i++) {
                if(ruleValue == items[i][1]) {
                    ans++;
                }
            }
        }

        if(rulekey == "name") {
            for(int i=0; i<items.length; i++) {
                if(ruleValue == items[i][2]) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
