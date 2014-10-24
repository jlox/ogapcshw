public class code{
public int[] frontPiece(int[] nums) {
  int[] result;
  if (nums.length >= 2){
  result = new int[2];
  result[0] = nums[0];
  result[1] = nums[1];
  } else {
  result = nums;
  }
  return result;
}

public int sum13(int[] nums) {
  int count = 0;
  int answer = 0;
  while (count < nums.length){
  if (nums[count] == 13 && count < (nums.length - 2)) {
  count = count + 2;
  }
  if (nums[count] == 13 && count >= (nums.length - 2)) {
  count = nums.length;
  } else {
  answer = answer + nums[count];
  count = count + 1;
  }
  }
  return answer;
}
}
