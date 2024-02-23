<!-- Plugin description -->


A [moonbit language](https://github.com/WebAssembly/component-model/blob/main/design/mvp/WIT.md) plugin for
IntelliJ-based IDEs, supports the `*.mbt` file extension.

## Features

| Feature            | Progress | Implement                                                                                                                                                 |
|--------------------|----------|-----------------------------------------------------------------------------------------------------------------------------------------------------------|
| Language Server    | ✅        | [MoonLanguageProtocol]()                                                                                                                                  |
| Syntax Highlight   | ✅        | [MoonSyntaxHighlighter](https://github.com/oovm/WIT-Intellij/blob/main/src/main/kotlin/com/github/bytecodealliance/ide/highlight/WitSyntaxHighlighter.kt) |
| Semantic Highlight | ✅        | [MoonHighlightVisitor](https://github.com/oovm/WIT-Intellij/blob/main/src/main/kotlin/com/github/bytecodealliance/ide/highlight/WitHighlightVisitor.kt)   |
| Pretty Formatter   | ✅        | [MoonFormatBuilder](https://github.com/oovm/WIT-Intellij/blob/main/src/main/kotlin/com/github/bytecodealliance/ide/formatter/WitFormatBuilder.kt)         |
| Block Folding      | ✅        | [MoonFoldingVisitor](https://github.com/oovm/WIT-Intellij/blob/main/src/main/kotlin/com/github/bytecodealliance/ide/matcher/WitFoldingVisitor.kt)         |
| Braces Matcher     | ✅        |                                                                                                                                                           |
| Smart Enter        | ✅        | [MoonSmartEnter]()                                                                                                                                        |

<!-- Plugin description end -->
