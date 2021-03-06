/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zuoxiaolong.blog.model.dto.cache;

import com.zuoxiaolong.blog.model.persistent.ArticleCategory;
import com.zuoxiaolong.blog.model.persistent.UserArticle;

/**
 * @author goozi
 * @create 2016-05-17 12:23
 * @since 1.0.0
 */
public class ArticleRankResponseDataResult {

    private ArticleCategory categoryInfo;

    private UserArticle articleInfo;

    public ArticleCategory getCategoryInfo() {
        return categoryInfo;
    }

    public void setCategoryInfo(ArticleCategory categoryInfo) {
        this.categoryInfo = categoryInfo;
    }

    public UserArticle getArticleInfo() {
        return articleInfo;
    }

    public void setArticleInfo(UserArticle articleInfo) {
        this.articleInfo = articleInfo;
    }
}
