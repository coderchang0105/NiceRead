package com.otherhshe.niceread.data;

/**
 * Author: Othershe
 * Time:  2016/8/11 13:34
 */
public class HttpResult<T> {
    public boolean error;
    public T results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }
}