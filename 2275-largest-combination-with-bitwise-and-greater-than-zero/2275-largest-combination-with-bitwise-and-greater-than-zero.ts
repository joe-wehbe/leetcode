function largestCombination(candidates: number[]): number {  
    let maxBinaryLength = Math.max(...candidates).toString(2).length;
    let binaryCandidates: string[] = [];  
    
    for(const candidate of candidates) {
        binaryCandidates.push(candidate.toString(2).padStart(maxBinaryLength, '0'));
    }
    
    let maxCombination = 0;
    
    for (let i = 0; i < maxBinaryLength; i++) {
        let onesCount = 0;
        for (const binaryCandidate of binaryCandidates) {
            if (binaryCandidate[i] === '1') {
                onesCount++;
            }
        }        
        maxCombination = Math.max(maxCombination, onesCount);
    }
    return maxCombination;
};