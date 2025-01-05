(defproject net.clojars.stylitics-graal/reitit-ring "0.7.1X-patched-graal"
  :description "Reitit: Ring routing"
  :url "https://github.com/metosin/reitit"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/metosin/reitit"
        :dir "../.."}
  :plugins [[lein-parent "0.3.9"]]
  :parent-project {:path "../../project.clj"
                   :inherit [:deploy-repositories :managed-dependencies]}
  :deploy-repositories [["clojars" "https://clojars.org/net.clojars.stylitics-graal/"]]
  :dependencies [[metosin/reitit-core]
                 [net.clojars.stylitics-graal/ring-core "1.12.2-patched-graal"]])
