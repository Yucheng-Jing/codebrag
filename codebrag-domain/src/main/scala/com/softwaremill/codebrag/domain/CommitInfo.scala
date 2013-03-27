package com.softwaremill.codebrag.domain

import org.joda.time.DateTime
import org.bson.types.ObjectId

case class CommitInfo(sha: String, message: String, authorName: String, committerName: String, date: DateTime, parents: List[String],
                       comments: List[CommitComment]) {

  def addComment(comment: CommitComment) = {
    copy(comments = comment :: comments)
  }
}

case class CommitComment(id: ObjectId, commentAuthorName: String, message: String, postingTime: DateTime)