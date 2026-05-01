class Solution {
    public String destCity(List<List<String>> paths) {
        for (int i = 0; i < paths.size(); i++) {
            String destination = paths.get(i).get(1);
            boolean found = false;

            for (int j = 0; j < paths.size(); j++) {
                if (paths.get(j).get(0).equals(destination)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return destination;
            }
        }
        return "";
    }
}
