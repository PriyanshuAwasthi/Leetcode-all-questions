class Solution {
	public int[] twoSum(int[] numbers, int target) {

		HashMap<Integer,Integer> map = new HashMap<>();
		int[] result = new int[2];
		for(int i=0;i<numbers.length;i++){
			if(map.containsKey(numbers[i])){
				result[0]=map.get(numbers[i])+1;
				result[1]=i+1;
				return result;
			}
			else
			{
				map.put(target-numbers[i],i);
			}
		}
		return result;
	}
}