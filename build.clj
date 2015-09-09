(require 'cljs.build.api)

(cljs.build.api/build "src" {:main          "let-test.core"
                             :language-in   :ecmascript6
                             :output-to     "out/let-test.js"
                             :output-dir    "out"
                             :optimizations :none
                             :verbose       true
                             :foreign-libs  [{:file        "libs/LetTest.js"
                                              :provides    ["LetTest"]}]})
