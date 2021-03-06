package com.fitec.formation.wiki.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utils.Constants;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentModel {
	
	private String content;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.DATE_PATTERN)
	private Date creationDate;

	private StatusModel statusModel;
	private ArticleModel articleModel;
    private UserModel userModel;
    private CommentModel parentCommentModel;
    private List<CommentModel> childCommentsModel;
	
}
