/**
 * Bank
 */
class Bank {
  static int next_bank = 1;
  final int MAX_ACCOUNT = 10;
  String name;
  int code, next_account, ind_array;
  Account[] account;

  Bank(String n) {
    name = n;
    code = next_bank++;
    next_account = new Account[MAX_ACCOUNT];
    ind_array = 0;
  }

  int getCodeBank() {
    return code;
  }

  String getNameBank() {
    return name;
  }

  Account createAccount(String name) {
    Account c;
    if (next_account == MAX_ACCOUNT)
      c = null;
    else {
      c = new Account(name, next_bank++, this);
      account[ind_array++] = c;
    }
    return c;
  }

  Account searchAccount(int cod) {
    for (int i = 0; i < ind_array; i++) {
      if (account[i].getCode() == cod)
        return account[i];
      return null;
    }
  }

}