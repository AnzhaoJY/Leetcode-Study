class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>(); 
        list.add(1);
        for (int i = 1 ; i <= rowIndex ; i++) list = pascal(list);
        return list;
    }
    
    public List<Integer> pascal (List<Integer> list) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        for (int i = 1 ; i < list.size() ; i++) {
            intList.add(list.get(i) + list.get(i - 1));
        }
        intList.add(1);
        return intList;
    }
}
