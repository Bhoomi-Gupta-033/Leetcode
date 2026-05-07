class Solution {
    public String reformatDate(String date) {
        
        String[] arr = date.split(" ");

        // day
        String day = arr[0].replaceAll("[a-zA-Z]", "");

        if(day.length() == 1) {
            day = "0" + day;
        }

        // months
        String[] months = {
            "Jan","Feb","Mar","Apr","May","Jun",
            "Jul","Aug","Sep","Oct","Nov","Dec"
        };

        String month = "";

        for(int i = 0; i < months.length; i++) {
            if(months[i].equals(arr[1])) {

                int m = i + 1;

                if(m < 10) {
                    month = "0" + m;
                } else {
                    month = "" + m;
                }
            }
        }

        // year
        String year = arr[2];

        return year + "-" + month + "-" + day;
    }
}
