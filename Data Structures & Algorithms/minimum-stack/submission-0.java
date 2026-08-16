class MinStack {
    Stack<Integer> ist;
    Stack<Integer> mist;

    public MinStack() {
        ist=new Stack<>();
        mist=new Stack<>();
    }
    
    public void push(int val) {
        ist.push(val);
        if(mist.isEmpty())
        mist.push(val);
        else
        mist.push(Math.min(val,mist.peek()));
    }
    
    public void pop() {
        ist.pop();
        mist.pop();
    }
    
    public int top() {
        return ist.peek();
    }
    
    public int getMin() {
        return mist.peek();
    }
}
