(ns frontend.api.path
  (:require [goog.string :as gstring]))

(defn project-settings [vcs-type org repo]
  (case vcs-type
    "bitbucket" (gstring/format
                  "/api/dangerzone/project/%s/%s/%s/settings"
                  vcs-type org repo)
    "github" (gstring/format
               "/api/v1/project/%s/%s/settings"
               org repo)))

(defn project-checkout-keys [vcs-type repo-name]
  (case vcs-type
    "bitbucket" (gstring/format
                  "/api/dangerzone/project/%s/%s/checkout-key"
                  vcs-type repo-name)
    "github" (gstring/format
               "/api/v1/project/%s/checkout-key"
               repo-name)))

(defn project-checkout-key  [vcs-type repo-name fingerprint]
  (case vcs-type
    "bitbucket" (gstring/format
                  "/api/dangerzone/project/%s/%s/checkout-key/%s"
                  vcs-type repo-name fingerprint)
    "github" (gstring/format
               "/api/v1/project/%s/checkout-key/%s"
               repo-name fingerprint)))

(defn project-ssh-key  [vcs-type repo-name]
  (case vcs-type
    "bitbucket" (gstring/format
                  "/api/dangerzone/project/%s/%s/ssh-key"
                  vcs-type repo-name)
    "github" (gstring/format
               "/api/v1/project/%s/ssh-key"
               repo-name)))

(defn project-plan [vcs-type org repo]
  (case vcs-type
    "bitbucket" (gstring/format
                  "/api/dangerzone/project/%s/%s/%s/plan"
                  vcs-type org repo)
    "github" (gstring/format
               "/api/v1/project/%s/%s/plan"
               org repo)))

(defn project-follow [vcs-type project]
  (case vcs-type
    "bitbucket" (gstring/format
                  "/api/dangerzone/project/%s/%s/follow"
                  vcs-type project)
    "github" (gstring/format
               "/api/v1/project/%s/follow"
               project)))

(defn project-unfollow [vcs-type project]
  (case vcs-type
    "bitbucket" (gstring/format
                  "/api/dangerzone/project/%s/%s/unfollow"
                  vcs-type project)
    "github" (gstring/format
               "/api/v1/project/%s/unfollow"
               project)))

(defn build-retry [vcs-type org-name repo-name build-num]
  (case vcs-type
    "bitbucket" (gstring/format
                  "/api/dangerzone/project/%s/%s/%s/%s/retry"
                  vcs-type org-name repo-name build-num)
    "github" (gstring/format
               "/api/v1/project/%s/%s/%s/retry"
               org-name repo-name build-num)))

(defn heroku-deploy-user [vcs-type repo-name]
  (case vcs-type
    "bitbucket" (gstring/format
                  "/api/dangerzone/project/%s/%s/heroku-deploy-user"
                  vcs-type repo-name)
    "github" (gstring/format
               "/api/v1/project/%s/heroku-deploy-user"
               repo-name)))
