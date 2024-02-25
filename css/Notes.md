# Notes 

## Position and Layout 

1. Static : Default position
2. Relative : Relative to its original position
3. Fixed : Like a fixed nav over scrolling
4. Absolute : Absolutely relative to its parent
5. Sticky : Mixture of static and fixed

## Semantic Tags 

1. main
2. section 
3. article 
4. aside 
5. header 
6. footer 
7. nav

## Errors 

Padding gets collapsed vertically on inline elements (hence, watch during responsive builds i.e., reducing the screen size)

Margin gets collapsed vertically on block elements i.e., if element1 having 60px bottom margin and element2 having 30px top margin then both will be combined together as 60px is higher, 60px gap difference will be given between element1 and element2

## Exception Handling 

Using ```display: inline-block``` would make the element to act as both inline and block level element by providing access to the inline element with margin on all four sides.

## Elements 

Inline Elements : Span, a, strong, img, em etc. (takes only specific space)
Block Elements : p, div, h2, h3, ul, li (takes whole width)

You can nest inline elements inside block level elements which will not work vice versa.

Margin works only left and right for inline elements whereas its on all 4 sides for block level elements. 
## Color Codes 

Hex Codes : #(start) 43(Red) f8(Blue) 8a(green) -> Code : #43f88a

## Selectors  

You can use ```class="something"``` or ```id="unique"``` to select elements fo styling as following 


```CSS
.selector 
.selector.subSelector
tag.selector.subSelector 

#id 
tag#id
```
### Descendant Selectors 

```CSS
Syntax : 
parent child(s){
    declarations
}

Example : 
div p{
    color: purple;
}
```

There is a difference between tag.class and tag .class - make sure to remember the space

### Attribute Selectors 

```CSS
Syntax : Only Attributes
tag[attribute(s)]{
    declarations
}

Example :
a[href]{
    background-color: orange; 
}


Syntax : Attributes with value
tag[attribute(s)=value]{
    declarations
}

Example :
a[href="www.google.com"]{
    background-color: orange; 
}


Syntax : Partial reference - find all attributes with value partially present
tag[attribute*=value]{
    declarations
}

Example :
a[href*="google"]{
    background-color: orange; 
}

Syntax : End Reference
tag[attribute$=value]{
    declarations
}

Example :
a[href$=".com"]{
    background-color: orange; 
}
```

## Cascade (Top to Bottom)



**Inheritance :** Elements can inherit CSS properties that are applied to their parents but not all properties are inherited those includes margin, padding, background styles, borders 

**Specification :** Specific properties will have higher priority compared to the parent properties which means how specific you are that prioritized the styles mentioned are prioritized






# Properties 

## General 

1. color 
2. border
   * border-radius 
   * styles
    - dashed
    - dotted
    - solid
  
  
3. display 
    * block 
    * inline
4. margin
5. padding 
6. *inherit* : this inherits the properties from the parent.

   
## Text 

1. text-align 
2. text-decoration : line-through, underline 
3. text-shadow : 2px(right) 2px(down) #e9e9e9(color)
4. text-transform : uppercase, lowercase
5. font-size
6. font-family   
7. font-weight : bold
8. line-height 
9. letter-spacing
   
## Alignment

1. column-count 
2. column-gap 
3. max-width
4. white-space : nowrap
5. box-sizing : border-box

## List 

1. list-style-type 
   - disc
   - square
   - none

## Miscallaneous 

1. span 
2. em 

