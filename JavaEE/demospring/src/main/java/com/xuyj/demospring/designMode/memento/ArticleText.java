package com.xuyj.demospring.designMode.memento;



import java.util.Date;

/**
 * 保存最新文章
 */
public class ArticleText {
    private String title;
    private String content;
    private Date createTime;

    public ArticleText(String title, String content, Date createTime) {
        this.title = title;
        this.content = content;
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public ArticleMemento saveToMemento(){
        ArticleMemento articleMemento = new ArticleMemento(this.title,this.content,this.createTime);
        return articleMemento;
    }

    public void getArticleFromMemento(ArticleMemento articleMemento){
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.createTime = articleMemento.getCreateTime();
    }
}
