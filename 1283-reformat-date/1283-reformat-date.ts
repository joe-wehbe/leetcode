function reformatDate(date: string): string {
    let arr: string[] = date.split(' ');
    let result: string[] = [];
    let map = new Map<string, string>([
        ["Jan", "1"], ["Feb", "2"], ["Mar", "3"],
        ["Apr", "4"], ["May", "5"], ["Jun", "6"],
        ["Jul", "7"], ["Aug", "8"], ["Sep", "9"],
        ["Oct", "10"], ["Nov", "11"], ["Dec", "12"],
    ]);

    result.push(arr[2]);
    
    let month = map.get(arr[1]);
    result.push(month.length == 1 ? '0' + month : month);

    let day = arr[0].slice(0, -2);
    result.push(day.length == 1 ? '0' + day : day);

    return result.join('-');
};