//
// This is only a SKELETON file for the 'Bank Account' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export class BankAccount {
  constructor() {
    this._balance = 0;
    this._open = false;
  }

  open() {
    if (this._open) throw new ValueError(); 
    this._open = true;
    this._balance = 0;
  }

  close() {
    if (!this._open) throw new ValueError(); 
    this._open = false;
  }

  deposit(value) {
    if (!this._open || value <= 0) throw new ValueError(); 
    this._balance += value;
  }

  withdraw(value) {
    if (this._balance < value || value <= 0 || !this._open) throw new ValueError(); 
    return this._balance -= value;
  }

  get balance() {
    if (!this._open) throw new ValueError(); 
    return this._balance;
  }
}

export class ValueError extends Error {
  constructor() {
    super('Bank account error');
  }
}
