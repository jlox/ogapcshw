public class classword{
public boolean more14(int[] nums) {
  int ones = 0;
  int fours = 0;
  for (int c=0;c<nums.length;c++){
      if (nums[c] == 1){
	  ones = ones + 1;
      } else {
	  if (nums[c] == 4){
	      fours = fours + 1;
	  }
      }
  }
  if (ones > fours){
      return true;
  } else {
      return false;
  }
}

public boolean tripleUp(int[] nums) {
    int oof = 0;
    for (int c=0;c<nums.length-2;c++){
	if (nums[c] == (nums[c+1] - 1)){
	    if (nums[c] == (nums[c+2] - 2)){
		oof = 1;
	    } else {
		oof = oof;
	    }
	}
    }
    if (oof == 1) {
	return true;
    } else {
	return false;
    }
}

public int sum67(int[] nums) {
  int result = 0;
  for (int c = 0; c < nums.length; c++) {
    if (nums[c] != 6) {
    result += nums[c];
    } else {
    for (int d = c; d < nums.length; d++) {
    if (nums[d] == 7) {
    c = d;
    break;
    }
    }
    }
  }
  return result;
}

public int[] tenRun(int[] nums) {
  for (int c = 0; c < nums.length; c++) {
  if (nums[c]%10 == 0) {
  int chgNum = nums[c];
  for (int e = c + 1; e < nums.length; e++) {
  if (nums[e]%10 == 0) {
  c = e - 1;
  break;
  }
  nums[e] = chgNum;
  }
  }
  }
  return nums;
}

public boolean canBalance(int[] nums) {
  for (int c = 0; c < nums.length; c++) {
  int leftNum = 0;
  int rightNum = 0;
  for (int left = c; left >= 0; left--) {
  leftNum += nums[left];
  }
  for (int right = c + 1; right < nums.length; right++) {
  rightNum += nums[right];
  }
  if (leftNum == rightNum) {
  return true;
  } 
  }
  return false;
}

public int[] seriesUp(int n) {
    int[] result = new int[n * (n+1) / 2];
    int place = 0;
    for (int i=1;i<=n+1;i++){
	for (int j=1;j<i;j++){
	    result[place++]=j;
	}
    }
    return result;
}

public int maxMirror(int[] nums) {
  int len=nums.length;
  int count=0;
  int max=0;
  for (int i=0;i<len;i++){
    count=0;
    for (int j=len-1;i+count < len && j>-1;j--){
      if(nums[i+count] == nums[j]){
        count++;
      }
      else{
        if (count > 0){
          max = Math.max(count,max);
          count = 0;
        }
      }
    }
    max = Math.max(count,max);
  }
  return max;
}
}
