function minChanges(s: string): number {
    
    let arr = s.split('');
    let count = 0;
    
    for(let i = 0; i < arr.length; i++) {
        if(arr[i] != arr[i + 1]) {
            arr[i] = arr[i+1];
            count++;
        }
        i++;
    }
    
    return count;
};