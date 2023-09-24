package com.xuyj.demospring.designMode.memento;



import java.util.ArrayList;
import java.util.List;

/**
 * 管理历史快照
 */
public class ArticleCaretaker {
    private final List<ArticleMemento> list = new ArrayList<>();

    public ArticleMemento getArticle(int index){
        return list.get(index);
    }

    public void setArticle(ArticleMemento articleMemento){
        list.add(articleMemento);
    }
}
