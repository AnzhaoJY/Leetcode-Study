
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        if (numRows == 0) return list; 
        list.add(one);
        for (int i = 1 ; i < numRows ; i++) list.add(pascal(list.get(i - 1)));
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
