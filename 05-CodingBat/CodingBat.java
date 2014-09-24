public class CodingBat {

public String nonStart(String a, String b) {
  String first = a.substring(1);
  String second = b.substring(1);
  return first + second;
}

public String makeAbba(String a, String b) {
  return a + b + b + a;
}

public int diff21(int n) {
  if (n < 21) {
  return 21 - n;
  } else {
  return (n-21) * 2;
  }
}
/* working */
public boolean nearHundred(int n) {
  if (Math.abs(100-n) <= 10) {
  return true;
  } else if (Math.abs(200-n) <= 10) {
  return true;
  } else {
  return false;}
}

/* working */
public int teaParty(int tea, int candy) {
  if (tea < 5 || candy < 5) {
  return 0;
  } else if ((tea * 2) <= candy || (candy * 2) <= tea) {
  return 2;
  } else {
  return 1;}
}

/* working */
public boolean lastDigit(int a, int b, int c) {
  if (a%10 == b%10 || a%10 == c%10 || b%10 == c%10){
  return true;
  } else {return false;}
}

/* working */
public boolean mixStart(String str) {
  if (str.length() < 3) {
  return false;
  }
  String Jeanne = str.substring(1);
  if (Jeanne.startsWith("ix")) {
  return true;
  } else {
  return false;
  }
}
}
