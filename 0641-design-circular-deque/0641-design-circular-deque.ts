class MyCircularDeque {
    
    private list: number[];
    private capacity: number;
    private size: number;

    constructor(k: number) {
        this.list = [];
        this.capacity = k;
        this.size = 0;
    }

    insertFront(value: number): boolean {
        return this.isFull() ? false : (this.list.unshift(value), this.size++, true); 
    }

    insertLast(value: number): boolean {
        return this.isFull() ? false : (this.list.push(value), this.size++, true); 
    }

    deleteFront(): boolean {
        return this.isEmpty() ? false : (this.list.shift(), this.size--, true);         
    }

    deleteLast(): boolean {
        return this.isEmpty() ? false : (this.list.pop(), this.size--, true);                 
    }

    getFront(): number {
        return this.isEmpty() ? -1 : this.list[0];
    }

    getRear(): number {
        return this.isEmpty() ? -1 : this.list[this.list.length - 1];
    }

    isEmpty(): boolean {
        return this.size == 0 ? true : false;
        
    }

    isFull(): boolean {
        return this.size == this.capacity ? true : false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * var obj = new MyCircularDeque(k)
 * var param_1 = obj.insertFront(value)
 * var param_2 = obj.insertLast(value)
 * var param_3 = obj.deleteFront()
 * var param_4 = obj.deleteLast()
 * var param_5 = obj.getFront()
 * var param_6 = obj.getRear()
 * var param_7 = obj.isEmpty()
 * var param_8 = obj.isFull()
 */