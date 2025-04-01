function convertDateToBinary(date: string): string {
    return date.split('-').map(num => Number(num).toString(2)).join('-');
};