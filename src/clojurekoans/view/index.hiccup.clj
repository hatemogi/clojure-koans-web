[:div#outer-wrapper
 [:div#stripe
  [:img.ko {:src "images/logo_ko.png"}]
  [:img.en {:src "images/logo.png"}]
  [:ul
   [:li.ko
    [:a {:href "#"} "서론"]]
   [:li.en
    [:a {:href "#"} "Introduction"]]
   [:li.ko
    [:a {:href "#"} "1. 자바설치하기"]]
   [:li.en
    [:a {:href "#"} "1. Install Java"]]
   [:li.ko
    [:a {:href "#"} "2. 선문답 설치하기"]]
   [:li.en
    [:a {:href "#"} "2. Install the Koans"]]
   [:li.ko
    [:a {:href "#"} "3. 첫번째 선문답"]]
   [:li.en
    [:a {:href "#"} "3. Run the First Koan"]]
   [:li.ko
    [:a {:href "#"} "4. 반복"]]
   [:li.en
    [:a {:href "#"} "4. Repeat"]]
   [:li.ko
    [:a {:href "#"} "테스트에 대한 한마디"]]
   [:li.en
    [:a {:href "#"} "A Word on Testing"]]
   [:li.ko
    [:a {:href "#"} "도움을 준 분들"]]
   [:li.en
    [:a {:href "#"} "Contributors"]]
   [:li.ko
    [:a {:href "#"} "감사의 말"]]
   [:li.en
    [:a {:href "#"} "Thanks"]]
   [:li.ko
    [:a {:href "#"} "역자의 말"]]]]

 [:div#inner-wrapper
  [:p
   [:input {:type "radio" :name "lang" :value "ko" :checked true :accesskey "k"} "한국어"]
   " "
   [:input {:type "radio" :name "lang" :value "en" :accesskey "e"} "English"]]

  [:div#one.section

   [:h1.ko "서론"]
   [:h1.en "Introduction"]

   [:p.ko "클로저 선문답은 여러분에게 "
    [:a {:href "http://www.clojure.org"} "클로저 언어"]
    "의 신비를 전수하는 연습 문제 모음입니다."
    "여러분은 앞에 펼쳐진 길을 따라가며, 간단한 데이터형에서 매크로까지, 꼬리재귀(tail recursion)에서 자바와의 연동까지, 클로저 언어의 주요한 측면들을 모두 접하게 될 것입니다."
    " 많은 분이 클로저가 그 전까지 썼던 프로그래밍 언어들과는 매우 다르다는 것을 알게될 것입니다."
    " 이 선문답은 점진적이며 문답식인 배움법으로 여러분이 자연스럽게 클로저 언어로 옮겨갈 수 있도록 도울 것입니다."
    " 모든 관문을 통과할 때 쯤이면, 클로저가 전혀 기이하지 않게 여겨질 것입니다."]
   [:p.en "Clojure koans are exercises meant to initiate you to the mysteries of the "
    [:a {:href "http://www.clojure.org"} "Clojure language"]
    ". By following along the path set before you, you will touch on all"
    " the major aspects of the language, from simple datatypes to macros, from tail recursion to Java interoperability. Many will find Clojure quite different"
    " from any programming language they've used before. The koans' incremental, interactive approach to learning the language will help make the transition"
    " feel natural. By the time you are finished with them, Clojure will not be so mysterious at all."]]

  [:div#two.section
   [:h1.ko "자바 설치하기"]
   [:h1.en "Install Java"]

   [:p.ko "선문답을 시작하기에 앞서 클로저가 필요하고, 클로저를 설치하기 전에 자바가 필요합니다. 아마도 여러분에게 자바가 이미 설치돼 있을테지만, "
    "만약 그렇지 않더라도, 설치하기는 어렵지 않습니다. 윈도 사용자는 "
    [:a {:href "http://www.java.com/en/download/help/windows_manual_download.xml"} "오라클의 윈도용 자바 설치 방법"]
    "을 참고하고, 리눅스 사용자는 선호하는 패키지 관리자를 이용하도록 합니다. 애플은 시스템 업데이트 도구를 통해 자바 6를 배포하고 있습니다."]
   [:p.en " Before we begin the koans, we need Clojure, and before we install Clojure, we'll need Java. You probably already have Java installed, but "
    "if you don't, it's not difficult. Oracle provides "
    [:a {:href "http://www.java.com/en/download/help/windows_manual_download.xml"} "installation instructions for Windows users"]
    ", and Linux users should use their package manager of choice. Apple distributes Java 6 with their system update tool."]
   [:p.ko "필요하다면 자바를 설치한 뒤, 콘솔(터미널)을 열어 아래 명령어를 입력합니다:"]
   [:p.en "After downloading Java (if necessary), go to your console and enter:"]
   [:div.terminal.ko "~ $ java -version"]
   [:div.terminal.en "~ $ java -version"]
   [:p.ko "버전 1.5 이상이 설치돼 있어야 합니다."]
   [:p.en "Make sure the version installed is 1.5 or greater."]]

  [:div#three.section
   [:h1.ko "선문답 설치하기"]
   [:h1.en "Install the Koans"]

   [:p.ko "여러분이 전문가답게 클로저를 쓰려한다면, "
    [:a {:href "http://leiningen.org"} "라이닝엔(Leiningen)"]
    "이라는 가장 널리 쓰이는 클로저 의존성 관리 도구를 써서 선문답을 설치하도록 합니다. (이게 곧 클로저를 설치해 줍니다.)"
    " 라이닝엔의 특혜를 받기 위해 "
    [:a {:href "http://leiningen.org/#install"} "설치 방법"]
    "을 따르도록 합니다."]
   [:p.en "If you'd like to jump into Clojure like the pros, you can install the koans with "
    [:a {:href "http://leiningen.org"} "Leiningen"]
    ", Clojure's most popular dependency management tool. (It will install Clojure for us shortly.)"
    " Follow the "
    [:a {:href "http://leiningen.org/#install"} "installation instructions"]
    " for Leiningen bliss. "]

   [:p.ko "중요: 이미 lein 1.x가 설치돼 있다면 "
    [:a {:href "https://github.com/technomancy/leiningen/wiki/Upgrading"} "라이닝엔 2로 업그레이드"]
    " 합니다."]
   [:p.en "Important: if you already have lein 1.x installed, you'll need to "
    [:a {:href "https://github.com/technomancy/leiningen/wiki/Upgrading"} "upgrade to Leiningen 2"]
    "."]

   [:p.ko "라이닝엔을 설치한 후에는, 선문답 저장소를 클론(clone)하면 됩니다:"]
   [:p.en "Once you have Leiningen installed, you just need to clone the koans repo:"]
   [:div.terminal.ko "$ git clone git://github.com/hatemogi/clojure-koans.git"]
   [:div.terminal.en "$ git clone git://github.com/functional-koans/clojure-koans.git"]
   [:p.ko "만약 라이닝엔을 쓰기 싫다면, 선문답을 손수 설치할 수 있습니다. "
    [:a {:href "http://github.com/hatemogi/clojure-koans/releases"} "여기 링크에서 최신 버전을 다운로드 받고 "]
    "압축을 풀어서 시작하실 수 있습니다."]
   [:p.en "If you don't want to use Leiningen to manage dependencies for you, you
       can still easily install the koans manually. [Note: this option will only
       work until "
    [:a {:href "https://github.com/blog/1302-goodbye-uploads"} "Github shuts down the Downloads feature completely"]
    " in March 2013.] Just download and unzip the latest version of the koans "
    [:a {:href "https://github.com/functional-koans/clojure-koans/downloads"} "here"]
    ", and you should be ready to start."]]

  [:div#five.section

   [:h1.ko "첫번째 선문답"]
   [:h1.en "Run the First Koan"]

   [:p.ko "앞서 설명한 라이닝엔이 설치돼 있다면"]
   [:p.en "Once you're inside the koans directory, you can immediately begin by running"]
   [:div.terminal "$ lein koan run"]
   [:p.ko "위의 명령어로 바로 시작할 수 있습니다."]
   [:p.en "if you have Leiningen installed as described above."]
   [:p.ko "(저장소를 클론한 뒤 clojure-koans 디렉토리로 이동하는 것을 잊지 마세요!)"]
   [:p.en "(Don't forget to cd into the clojure-koans directory after you've cloned the repo!)"]
   [:p.ko "또는, 라이닝엔을 안 쓴다면, 아래처럼 씁니다"]
   [:p.en "Or, if you're not using Leiningen, you can use"]
   [:div.terminal "$ script/run"]
   [:p.ko "맥이나 리눅스에서는 위 명령어를 실행하고,"]
   [:p.en "on Mac or Unix, or "]
   [:div.terminal "$ script\\run"]
   [:p.ko "윈도에서는 위 명렁어를 씁니다."]
   [:p.en "on Windows. "]
   [:p.ko "그러면 아래와 같은 에러 메시지를 보게 됩니다:"]
   [:p.en " instead. You'll probably see an error message like this:"]
   [:div.terminal.ko " Now meditate on ~/clojure-koans/src/koans/01_equalities.clj:6"
    [:br]
    "---------------------"
    [:br]
    "Assertion failed!"
    [:br]
    "같은지 확인해가며 현실을 시험해서 진실을 주의깊게 관찰하라"
    [:br]
    "(= __ true)"]
   [:div.terminal.en " Now meditate on ~/clojure-koans/src/koans/01_equalities.clj:6"
    [:br]
    "---------------------"
    [:br]
    "Assertion failed!"
    [:br]
    "We shall contemplate truth by testing reality, via equality."
    [:br]
    "(= __ true)"]
   [:p.ko "위 내용은 01_equalities.clj 파일의 6째줄에서 테스트가 실패하고 있다는 뜻입니다. 그럼 그 파일을 여러분이 즐겨 쓰는 텍스트 에디터로 열고, 밑줄 친 빈칸을 채워서 테스트를 통과하도록 합시다!"]
   [:p.en "The output is telling you that you have a failing test in the file
       01_equalities.clj, on line 3. So open that file up in a text editor and
       make it pass by filling in the blanks!"]]

  [:div#six.section
   [:h1.ko "반복"]
   [:h1.en "Repeat"]

   [:p.ko "첫번째 테스트를 통과하고 나면 그 다음 테스트가 실패하는 것을 알게 될 것입니다. 한 파일의 모든 테스트를 통과하고 나면, 자동으로 그 다음 파일의 선문답 과정이 시작됩니다."]
   [:p.en " After you run and pass your first test, you'll find that the next one is failing. After all the tests in a file are passing, the"
    " run script will automatically begin testing the next file in the koans sequence."]]

  [:div#seven.section
    [:h1.ko "테스트에 대해 한말씀"]
    [:h1.en "A Word on Testing"]

    [:p.ko "실패하는 테스트를 먼저 작성하고나서 그 테스트를 통과하는 코드를 나중에 작성하는 방식은 단지 색다른 것만은 아닙니다: "
     "이런 방식이 테스트 주도 개발 (TDD)의 기초입니다. TDD는 경험이 풍부한 사람들은 각각의 새 테스트가 최대한 단순하고 자연스러워야한다고 말합니다."
     "또한 진행과 함께 규칙적으로 명상할 것을 강조합니다: 테스트를 통과하고 나면, 그 다음 테스트로 넘어가기 전에 잠깐 진행을 멈추고 "
     "리팩토링과 개선 작업을 먼저 하도록 합니다."]
    [:p.en "The pattern of writing failing tests first and code to make them pass later is no mere novelty: it is"
     " the essence of test-driven development (TDD). The sages of TDD say that every new test should strive to"
     " be the simplest and most natural extension of those that come before it, so as to cover only one new part"
     " of the code. They also enjoin disciples to meditate on their progress regularly: after a test is made"
     " to pass, one should pause to refactor and refine one's code before moving on to the next test."]
    [:p.ko "실제 테스트 주도 개발 프로젝트에서는 직접 테스트 코드를 작성해야겠지만, 선문답의 테스트는 미리 준비돼 있습니다."
     " 여러분의 클로저 프로젝트를 시작할 준비가 되어서 직접 테스트 코드를 작성하려거든, "
     [:a {:href "http://speclj.com/"} " Speclj"]
     " 같은 프레임워크가 길잡이가 되어줄 것입니다."]
    [:p.en "The koans, unlike tests in real test-driven projects, are already written for you. When you are"
     " ready to begin your own Clojure project and therefore your own tests, consider using a framework like"
     [:a {:href "http://speclj.com/"} " Speclj"]
     " to aid you on your journey."]]


  [:div#eight.section
    [:h1.ko "도움을 준 분들"]
    [:h1.en "Contributors"]

    [:p.ko [:a {:href "https://github.com/functional-koans/clojure-koans/graphs/contributors"} "도움을 준 분들"]]
    [:p.en [:a {:href "https://github.com/functional-koans/clojure-koans/graphs/contributors"} "Our Contributors"]]

    [:p.ko "선문답에 대해 질문이나 제안하실 것이 있으면 "
     [:a {:href "https://github.com/functional-koans/clojure-koans/"} "이슈를 등록하거나 풀리퀘스트(pull request)를 보내주세요"]
     "."]
    [:p.en "If you have any questions or suggestions about the koans, feel free to "
     [:a {:href "https://github.com/functional-koans/clojure-koans/"} "open an issue or pull request"]
     "."]]

  [:div#nine.section
   [:h1.ko "감사의 말"]
   [:h1.en "Thanks"]

   [:p.ko "선문답에 비유해 프로그래밍 언어를 배우는 도구로 활용하는 것은 "
    [:a {:href "http://edgecase.com/"} "EdgeCase"]
    "의 "
    [:a {:href "http://rubykoans.com/"} "루비 선문답(Ruby Koans)"]
    "에서 시작됐습니다. "
    "그리고, 클로저 선문답은 "
    [:a {:href "http://thinkrelevance.com/"} "Relevance"]
    "의 개발자들에 의해 시작됐습니다. 원문 웹사이트는 "
    [:a {:href "http://www.joodoweb.com"} "Joodo"]
    "를 써서 개발했고 "
    [:a {:href "http://www.8thlight.com"} "8th Light"]
    "가 호스팅 해주고 있습니다"
    "."]
   [:p.en "Using the koans metaphor as a tool for learning a programming language started with the "
    [:a {:href "http://rubykoans.com/"} "Ruby Koans"]
    " by "
    [:a {:href "http://edgecase.com/"} "EdgeCase"]
    "; the Clojure koans themselves were started by developers at "
    [:a {:href "http://thinkrelevance.com/"} "Relevance"]
    ". This website is produced and hosted by "
    [:a {:href "http://www.8thlight.com"} "8th Light"]
    " and powered by "
    [:a {:href "http://www.joodoweb.com"} "Joodo"]
    "."]]
  [:div#ten.section.ko
   [:h1 "역자의 말"]
   [:p "이 사이트는 "
    [:a {:href "http://hatemogi.com"} "김대현"] "이 한국어로 번역했고, "
    [:a {:href "https://pages.github.com"} "GitHub Pages"]
    "로 호스팅되고 있습니다. 원문 웹사이트는 "
    [:a {:href "http://clojurekoans.com"} "http://clojurekoans.com"]
    "에서 보실 수 있습니다."]
   [:p "번역에 관한 문의나 제안은 "
    [:a {:href "https://github.com/hatemogi/clojure-koans/issues"} "이슈로 남겨"]
    "주시거나, "
    [:a {:href "https://github.com/hatemogi/clojure-koans/pulls"} "풀리퀘스트를 보내"]
    "주세요."]]
  [:div.clearfix]]
 [:script "(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)})(window,document,'script','//www.google-analytics.com/analytics.js','ga'); ga('create', 'UA-61112360-3', 'auto'); ga('send', 'pageview');"]
 ]
