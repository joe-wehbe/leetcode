function lemonadeChange(bills: number[]): boolean {
    let five = 0;
    let ten = 0;

    for (const bill of bills) {
        if(bill == 5) five++;
        if(bill == 10) ten++, five--;
        if(bill == 20) ten > 0 ? (ten--, five--) : five -= 3;

        if(five < 0 || ten < 0) return false;
    }

    return true;
};