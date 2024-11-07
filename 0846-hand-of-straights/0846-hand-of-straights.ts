function isNStraightHand(hand: number[], groupSize: number): boolean {
    if(hand.length % groupSize != 0) return false;
    hand.sort((a, b) => a - b);
    
    let map: Map<number, number> = new Map();
    for(const num of hand) {
        map.has(num) ? map.set(num, map.get(num) + 1) : map.set(num, 1);
    }
    
    while (map.size != 0) {
        let smallestNum = map.keys().next().value;
        let next = smallestNum + 1;
        let kTimes = groupSize - 1;
        
        while (kTimes > 0) {
            if(!map.has(next)) return false;
            map.get(next) == 1 ? map.delete(next) : map.set(next, map.get(next) - 1);
            kTimes--;
            next++;
        }
        map.get(smallestNum) == 1 ? map.delete(smallestNum) : map.set(smallestNum, map.get(smallestNum) - 1);        
    }
    return true;  
};