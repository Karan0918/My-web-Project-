function toggle_visibility(id) {
  var e = document.getElementById(id);
  if(e.style.display == 'grid')
    e.style.display = 'none';
  else
    e.style.display = 'grid';
}

jQuery(document).ready(function ($) {
	setInterval(function(){
		let mainHeight = $('.mainBodyLeft').height();
		$('.trendingGames').css('height',mainHeight);
	},500);
});