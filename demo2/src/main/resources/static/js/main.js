$(document).ready(function () {
    /*轮播图*/
    var i = 0;
    var clone = $(".cfWrap .proWrap li").first().clone();
    $(".cfWrap .proWrap").append(clone);
    var size = $(".proWrap li").size();
    
    /*添加轮播图圆点*/
    for(var j=0;j<size-1;j++){
    	$(".cfWrap .dotWrap").append("<span></span>")
    }
    
    $(".cfWrap .dotWrap span").first().addClass("active");
   var ww = $(".cfWrap .proWrap").children("li").length;
   $(".cfWrap .proWrap").width(ww*1200);
   
   
    
    /*点击左右翻页*/
   
   $(".cfWrap .leftArrow").click(function(){
		
		moveL();
	})
   
	$(".cfWrap .rightArrow").click(function(){
		moveR();
	})
	
	
	function moveL(){
		i--
		if (i==-1) {
			$(".cfWrap .proWrap").css({left:-(size-1) * 1200});
			i = size-2;
		}
		$(".cfWrap .proWrap").stop().animate({left: -i * 1200},500)
		$(".cfWrap .dotWrap span").eq(i).addClass("active").siblings().removeClass("active")
	}

    function moveR() {
        i++;
        if (i == size) {
            $(".cfWrap .proWrap").css({ left: 0 });
            i = 1;
        }
        $(".cfWrap .proWrap").stop().animate({ left: -i * 1200 }, 500);
        if (i == size - 1) {
            $(".cfWrap .dotWrap span").eq(0).addClass("active").siblings().removeClass("active")

        } else {
            $(".cfWrap .dotWrap span").eq(i).addClass("active").siblings().removeClass("active")
        }

    }
    
    
    /*鼠标滑入轮播*/
    $(".cfWrap .dotWrap span").hover(function () {
        var index = $(this).index();
        i = index;
        $(".cfWrap .proWrap").stop().animate({ left: -index * 1200 }, 500);
        $(this).addClass("active").siblings().removeClass("active")
    });




    /*自动轮播*/
    var t = setInterval(moveR, 2500);

    /*鼠标滑过定时器停止*/
    $(".cfWrap").hover(function () {
        clearInterval(t);
    }, function () {
        t = setInterval(moveR, 2500);
    })




})