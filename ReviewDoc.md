#==無法用code複習的題目在這個文字檔==
#程式複習有: OuterClass、AnoymousClass、InnerClass、enum 

1. vector是java早期的東西，但還存在是因為要保持相容性，在寫程式的時候必須避免使用，可以改用arraylist來代替。
   相關的參考網站：http://www.programgo.com/article/75721727126/ 或搜尋關鍵字 "vetor java 淘汰"
2. RDBMS(Relationnl Database management system)複習
<br />(1) DDL -> truncate, drop, alert, create
<br />(2) DML -> insert, delete, update, select
<br />(3) DCL -> grant, revoke, commit, rollback
<br />(4) Primary key -> 唯一值，不可為null，一個table只能有一個primary key，primary key可以由多個column組成
<br />(5) Foreign key -> 其他的table reference到本地table的primary key
<br />(6) Unique -> 唯一值，可以null，一個table可以多個unique
<br />(7) order by asc(小 -> 大)，desc(大 -> 小)
<br />(8) Having 
<br />(9) Group by
<br />(10) outer(left, right, full) join, inner join
<br />(11) 資料庫正規化
3. java 型態
<br />(1) public : 當前類別、同一個package、子孫、其他package
<br />(2) protected : 當前類別、同一個package、子孫
<br />(3) friendly(沒宣告時候) : 當前類別、同一個package
<br />(4) private : 當前類別
<br />(5) final :　如果宣告在class代表無法被繼承(EX: final class Test)
<br />如果宣告成變數並且給值，此值無法更動。如果宣告成變數並且沒有給值，可以在建構值給值，但之後無法異動。意思都是只能設定一次
<br />(6) static : jvm載入時就會分配記憶體給宣告static的method或變數
4. 建構子
<br />(1) 宣告為private時，代表不能new此class
5. Override & Overload
<br />(1) Override : 複寫method
<br />(2) Overload : 同一個method，但參數不同
6. ORM跟Direct SQL如何選擇
<br />當SQL比較複雜且有考慮到效能問題時，是比較偏向使用Direct SQL。因為ORM串出來的SQL有可能比較沒效率。但如果還是想要用ORM時，可以靠慮使用
   Stored Procedure來增加效率。
7. 
