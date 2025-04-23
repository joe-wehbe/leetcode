function capitalizeTitle(title: string): string {
    let arr: string[] = title.split(' ');

    for (let i = 0; i < arr.length; i++) {
        if (arr[i].length <= 2) {
            arr[i] = arr[i].toLowerCase();
        }
        else {
            arr[i] = arr[i].charAt(0).toUpperCase() + arr[i].slice(1).toLowerCase();
        }
    }

    return arr.join(' ');
};