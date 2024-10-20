function parseBoolExpr(expression: string): boolean {
    
    let stack: number[] = [];
    let expressionArr = expression.split('');
    
    for(let i = 0; i < expressionArr.length; i++) {
        if (expressionArr[i] == '(') {
            stack.push(i);
        }
        
        if (expressionArr[i] == ')') {
            let startIndex = stack.pop();
            if (startIndex !== undefined) {
                let evaluationResult = evaluate(expressionArr[startIndex - 1], expressionArr.slice(startIndex + 1, i).join(''));
                expressionArr.splice(startIndex - 1, i - startIndex + 2, evaluationResult);
                i = startIndex - 1;
            }
        }
    }
    return expressionArr[0] == 't' ? true : false;
};

function evaluate(operator: string, expression: string): string {
    if(operator == '&') {
        return expression.includes('f') ? 'f' : 't';
    }

    else if (operator == '|') {
        return expression.includes('t') ? 't' : 'f';
    }

    else if (operator == '!') {
        return expression == 't' ? 'f' : 't';
    }
    
    return '';
}