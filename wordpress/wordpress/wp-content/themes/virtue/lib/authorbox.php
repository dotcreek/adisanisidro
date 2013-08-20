<?php
function virtue_author_box() { ?>
<div class="author-box">
	<ul class="nav nav-tabs" id="authorTab">
  <li class="active"><a href="#about"><?php _e('About Author', 'virtue'); ?></a></li>
  <li><a href="#latest"><?php _e('Latest Posts', 'virtue'); ?></a></li>
</ul>
 
<div class="tab-content postclass">
  <div class="tab-pane clearfix active" id="about">
  	<div class="author-profile vcard">
		<?php echo get_avatar( get_the_author_id(), 80 ); ?>
        <div class="author-follow"><span class="followtext"><?php _e('Follow', 'virtue'); ?> <?php the_author_meta( 'display_name' ); ?>:</span>
        <?php if ( get_the_author_meta( 'facebook' ) ) { ?>
			<span class="facebooklink">
				<a href="<?php the_author_meta( 'facebook' ); ?>" title="<?php _e('Follow', 'virtue'); ?>  <?php the_author_meta( 'display_name' ); ?> <?php _e('on Facebook', 'virtue');?>"><i class="icon-facebook"></i></a>
			</span>
            <?php } if ( get_the_author_meta( 'twitter' ) ) { ?>
            <span class="twitterlink">
				<a href="http://twitter.com/<?php the_author_meta( 'twitter' ); ?>" title="<?php _e('Follow', 'virtue'); ?>  <?php the_author_meta( 'display_name' ); ?> <?php _e('on Twitter', 'virtue');?>"><i class="icon-twitter"></i></a>
			</span>
            <?php } if ( get_the_author_meta( 'google' ) ) { ?>
            <span class="googlepluslink">
				<a href="<?php the_author_meta( 'google' ); ?>" title="<?php _e('Follow', 'virtue'); ?>  <?php the_author_meta( 'display_name' ); ?> <?php _e('on Google Plus', 'virtue');?>"><i class="icon-google-plus"></i></a>
			</span>
            <?php } if ( get_the_author_meta( 'flickr' ) ) { ?>
            <span class="flickrlink">
				<a href="<?php the_author_meta( 'flickr' ); ?>" title="<?php _e('Follow', 'virtue'); ?>  <?php the_author_meta( 'display_name' ); ?> <?php _e('on Flickr', 'virtue');?>"><i class="icon-flickr-2"></i></a>
			</span>
            <?php } if ( get_the_author_meta( 'vimeo' ) ) { ?>
            <span class="vimeolink">
				<a href="<?php the_author_meta( 'vimeo' ); ?>" title="<?php _e('Follow', 'virtue'); ?>  <?php the_author_meta( 'display_name' ); ?> <?php _e('on Vimeo', 'virtue');?>"><i class="icon-vimeo"></i></a>
			</span>
            <?php } if ( get_the_author_meta( 'linkedin' ) ) { ?>
            <span class="linkedinlink">
				<a href="<?php the_author_meta( 'linkedin' ); ?>" title="<?php _e('Follow', 'virtue'); ?>  <?php the_author_meta( 'display_name' ); ?> <?php _e('on linkedin', 'virtue');?>"><i class="icon-linkedin"></i></a>
			</span>
            <?php } if ( get_the_author_meta( 'dribbble' ) ) { ?>
            <span class="dribbblelink">
				<a href="<?php the_author_meta( 'dribbble' ); ?>" title="<?php _e('Follow', 'virtue'); ?>  <?php the_author_meta( 'display_name' ); ?> <?php _e('on Dribbble', 'virtue');?>"><i class="icon-dribbble"></i></a>
			</span>
      <?php } if ( get_the_author_meta( 'pinterest' ) ) { ?>
            <span class="pinterestlink">
				<a href="<?php the_author_meta( 'pinterest' ); ?>" title="<?php _e('Follow', 'virtue'); ?>  <?php the_author_meta( 'display_name' ); ?> <?php _e('on Pinterest', 'virtue');?>"><i class="icon-pinterest"></i></a>
			</span>
      <?php } if ( get_the_author_meta( 'instagram' ) ) { ?>
      <span class="instagramlink">
        <a href="<?php the_author_meta( 'instagram' ); ?>" title="<?php _e('Follow', 'virtue'); ?>  <?php the_author_meta( 'display_name' ); ?> <?php _e('on Instagram', 'virtue');?>"><i class="icon-instagram"></i></a>
      </span>
		<?php } ?>
        </div><!--Author Follow-->

		<h5 class="author-name"><?php the_author_posts_link(); ?></h5>
        <?php if ( get_the_author_meta( 'occupation' ) ) { ?>
        <p class="author-occupation"><strong><?php the_author_meta( 'occupation' ); ?></strong></p>
        <?php } ?>
		<p class="author-description author-bio">
			<?php the_author_meta( 'description' ); ?>
		</p>
        </div>
   </div><!--pane-->
  <div class="tab-pane clearfix" id="latest">
  <div class="author-latestposts">
  <?php echo get_avatar( get_the_author_id(), 80 ); ?>
  <h5><?php _e('Latest posts from', 'virtue'); ?> <?php the_author_posts_link(); ?></h5>
  			<ul>
			<?php
            $args = array( 'numberposts' => '3' );
            $recent_posts = wp_get_recent_posts( $args );
            foreach( $recent_posts as $post ){
			echo '<li><a href="' . get_permalink($post["ID"]) . '" title="'.$post["post_title"].'" ><i class="icon-arrow-right-2"></i>' .   $post["post_title"].'</a><span class="recentpost-date"> - '. get_the_time('F j, Y', $post["ID"]) .'</span> </li> ';
			} ?>
			</ul>
	</div><!--Latest Post -->
  </div><!--Latest pane -->
</div><!--Tab content -->
</div><!--Author Box -->
 <?php } ?>