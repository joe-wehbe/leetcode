function defangIPaddr(address: string): string {
    let arr: string[] = address.split('');

    for (let i = 0; i < address.length; i++) {
        if (arr[i] === '.') arr[i] = '[.]';
    }

    return arr.join('');
}