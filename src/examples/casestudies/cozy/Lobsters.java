package casestudies.cozy;

import java.util.Random;

public class Lobsters implements java.io.Serializable {
  protected java.util.ArrayList<Story> _var1351;

  public Lobsters() {
    clear();
  }

  public Lobsters(java.util.ArrayList<Story> stories, java.util.ArrayList<Vote> votes) {
    _var1351 = stories;
  }

  public void clear() {
    _var1351 = new java.util.ArrayList<Story>();
  }

  /*
   * public void selectStoryVotes(Integer p1, Integer p2, Integer p3, Integer p4,
   * java.util.function.Consumer<_Type6793> _callback) { for (Story _s6800 : _var1351) { Boolean
   * _v6801 = true; _label6802: do { for (StoryTag _t6805 : ((_s6800).getVal()).tags) { if
   * ((java.util.Objects.equals((_t6805).tag_id, p2))) { { { _v6801 = false; break _label6802; } } }
   * } } while (false); Boolean _v6806 = true; _label6807: do { for (HiddenToUser _u6810 :
   * ((_s6800).getVal()).hidden_to_users) { if ((java.util.Objects.equals((_u6810).user_id, p1))) {
   * { { _v6806 = false; break _label6807; } } } } } while (false); Boolean _v6811; Boolean _v6812;
   * Boolean _v6813; Boolean _v6814; Boolean _v6815; if ((((_s6800).getVal()).created_at > p3)) {
   * _v6815 = (!((!(_v6801)))); } else { _v6815 = false; } if (_v6815) { _v6814 = (!((!(_v6806))));
   * } else { _v6814 = false; } if (_v6814) { _v6813 = (((_s6800).getVal()).vote_count > 0); } else
   * { _v6813 = false; } if (_v6813) { _v6812 =
   * (java.util.Objects.equals(((_s6800).getVal()).is_expired, false)); } else { _v6812 = false; }
   * if (_v6812) { _v6811 = (java.util.Objects.equals(((_s6800).getVal()).merged_story_id, 0)); }
   * else { _v6811 = false; } if (_v6811) { { java.util.ArrayList<Vote> _var6796 = new
   * java.util.ArrayList<Vote>(); for (Vote _v6799 : ((_s6800).getVal()).votes) { Boolean _v6816; if
   * ((java.util.Objects.equals(((_v6799).getVal()).user_id, p4))) { _v6816 =
   * (java.util.Objects.equals(((_v6799).getVal()).comment_id, 0)); } else { _v6816 = false; } if
   * (_v6816) { { { _var6796.add(_v6799); } } } } { _callback.accept(new _Type6793(_s6800,
   * _var6796)); } } } } }
   */

  public void insertVote(Vote v) {
  }

  public void insertStory(Story s) {
    {
      _var1351.add(s);
    }
  }

  public static class HiddenToUser implements java.io.Serializable {
    private Integer story_id;
    private Integer user_id;

    public Integer getStory_id() {
      return story_id;
    }

    public Integer getUser_id() {
      return user_id;
    }

    public HiddenToUser(Integer story_id, Integer user_id) {
      this.story_id = story_id;
      this.user_id = user_id;
    }

    @Override
    public int hashCode() {
      int _hash_code6817 = 0;
      _hash_code6817 = (_hash_code6817 * 31) ^ ((story_id).hashCode());
      _hash_code6817 = (_hash_code6817 * 31) ^ ((user_id).hashCode());
      return _hash_code6817;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof HiddenToUser))
        return false;
      HiddenToUser o = (HiddenToUser) other;
      Boolean _v6818;
      if ((java.util.Objects.equals(this.story_id, o.story_id))) {
        _v6818 = (java.util.Objects.equals(this.user_id, o.user_id));
      } else {
        _v6818 = false;
      }
      return _v6818;
    }
  }

  public static class StoryTag implements java.io.Serializable {
    private Integer story_id;
    private Integer tag_id;

    public Integer getStory_id() {
      return story_id;
    }

    public Integer getTag_id() {
      return tag_id;
    }

    public StoryTag(Integer story_id, Integer tag_id) {
      this.story_id = story_id;
      this.tag_id = tag_id;
    }

    @Override
    public int hashCode() {
      int _hash_code6819 = 0;
      _hash_code6819 = (_hash_code6819 * 31) ^ ((story_id).hashCode());
      _hash_code6819 = (_hash_code6819 * 31) ^ ((tag_id).hashCode());
      return _hash_code6819;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof StoryTag))
        return false;
      StoryTag o = (StoryTag) other;
      Boolean _v6820;
      if ((java.util.Objects.equals(this.story_id, o.story_id))) {
        _v6820 = (java.util.Objects.equals(this.tag_id, o.tag_id));
      } else {
        _v6820 = false;
      }
      return _v6820;
    }
  }

  public static class _Type6789 implements java.io.Serializable {
    private Integer id;
    private Integer user_id;
    private Integer comment_id;
    private int evospecid;

    public Integer getId() {
      return id;
    }

    public Integer getUser_id() {
      return user_id;
    }

    public Integer getComment_id() {
      return comment_id;
    }

    // public _Type6789(Integer id, Integer user_id, Integer comment_id) {
    _Type6789(Integer id, Integer user_id, Integer comment_id) {
      this.id = id;
      this.user_id = user_id;
      this.comment_id = comment_id;
      evospecid = (new Random()).nextInt(1000000);
    }

    @Override
    public int hashCode() {
      int _hash_code6821 = 0;
      _hash_code6821 = (_hash_code6821 * 31) ^ ((id).hashCode());
      _hash_code6821 = (_hash_code6821 * 31) ^ ((user_id).hashCode());
      _hash_code6821 = (_hash_code6821 * 31) ^ ((comment_id).hashCode());
      return _hash_code6821;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type6789))
        return false;
      _Type6789 o = (_Type6789) other;
      Boolean _v6822;
      if ((java.util.Objects.equals(this.id, o.id))) {
        Boolean _v6823;
        if ((java.util.Objects.equals(this.user_id, o.user_id))) {
          _v6823 = (java.util.Objects.equals(this.comment_id, o.comment_id));
        } else {
          _v6823 = false;
        }
        _v6822 = _v6823;
      } else {
        _v6822 = false;
      }
      return _v6822;
    }
  }

  public static class Vote extends _Type6789 implements java.io.Serializable {
    public _Type6789 getVal() {
      return this;
    }

    public Vote(Integer _v6824, Integer _v6825, Integer _v6826) {
      super(_v6824, _v6825, _v6826);
    }
  }

  public static class _Type6791 implements java.io.Serializable {
    private Integer merged_story_id;
    private Boolean is_expired;
    private Integer created_at;
    private Integer vote_count;
    // private java.util.ArrayList<HiddenToUser> hidden_to_users;
    // private java.util.ArrayList<StoryTag> tags;
    // private java.util.ArrayList<Vote> votes;
    java.util.ArrayList<HiddenToUser> hidden_to_users;
    java.util.ArrayList<StoryTag> tags;
    java.util.ArrayList<Vote> votes;
    private int evospecid; // Random id to be used as an identifier for the object

    public Integer getMerged_story_id() {
      return merged_story_id;
    }

    public Boolean getIs_expired() {
      return is_expired;
    }

    public Integer getCreated_at() {
      return created_at;
    }

    public Integer getVote_count() {
      return vote_count;
    }

    public java.util.ArrayList<HiddenToUser> getHidden_to_users() {
      return hidden_to_users;
    }

    public java.util.ArrayList<StoryTag> getTags() {
      return tags;
    }

    public java.util.ArrayList<Vote> getVotes() {
      return votes;
    }

    // public _Type6791(Integer merged_story_id, Boolean is_expired, Integer created_at,
    _Type6791(Integer merged_story_id, Boolean is_expired, Integer created_at, Integer vote_count,
        java.util.ArrayList<HiddenToUser> hidden_to_users, java.util.ArrayList<StoryTag> tags,
        java.util.ArrayList<Vote> votes) {
      this.merged_story_id = merged_story_id;
      this.is_expired = is_expired;
      this.created_at = created_at;
      this.vote_count = vote_count;
      this.hidden_to_users = hidden_to_users;
      this.tags = tags;
      this.votes = votes;
      evospecid = (new Random()).nextInt(1000000);
    }

    @Override
    public int hashCode() {
      // int _hash_code6827 = 0;
      // _hash_code6827 = (_hash_code6827 * 31) ^ ((merged_story_id).hashCode());
      // _hash_code6827 = (_hash_code6827 * 31) ^ ((is_expired).hashCode());
      // _hash_code6827 = (_hash_code6827 * 31) ^ ((created_at).hashCode());
      // _hash_code6827 = (_hash_code6827 * 31) ^ ((vote_count).hashCode());
      // _hash_code6827 = (_hash_code6827 * 31) ^ ((hidden_to_users).hashCode());
      // _hash_code6827 = (_hash_code6827 * 31) ^ ((tags).hashCode());
      // _hash_code6827 = (_hash_code6827 * 31) ^ ((votes).hashCode());
      // return _hash_code6827;
      return evospecid;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type6791))
        return false;
      _Type6791 o = (_Type6791) other;
      return evospecid == o.evospecid;
      /*
       * Boolean _v6828; Boolean _v6829; if ((java.util.Objects.equals(this.merged_story_id,
       * o.merged_story_id))) { Boolean _v6830; if ((java.util.Objects.equals(this.is_expired,
       * o.is_expired))) { _v6830 = (java.util.Objects.equals(this.created_at, o.created_at)); }
       * else { _v6830 = false; } _v6829 = _v6830; } else { _v6829 = false; } if (_v6829) { Boolean
       * _v6831; Boolean _v6832; if ((java.util.Objects.equals(this.vote_count, o.vote_count))) {
       * _v6832 = ((this.hidden_to_users == o.hidden_to_users)); } else { _v6832 = false; } if
       * (_v6832) { Boolean _v6833; if (((this.tags == o.tags))) { _v6833 = ((this.votes ==
       * o.votes)); } else { _v6833 = false; } _v6831 = _v6833; } else { _v6831 = false; } _v6828 =
       * _v6831; } else { _v6828 = false; } return _v6828;
       */
    }
  }

  public static class Story extends _Type6791 implements java.io.Serializable {
    public _Type6791 getVal() {
      return this;
    }

    /** Added by Pablo **/
    public Story(Integer _v6834, Boolean _v6835, Integer _v6836, Integer _v6837) {
      super(_v6834, _v6835, _v6836, _v6837, new java.util.ArrayList<HiddenToUser>(),
          new java.util.ArrayList<StoryTag>(), new java.util.ArrayList<Vote>());
    }

    public void addHiddenToUsers(HiddenToUser h) {
      hidden_to_users.add(h);
    }

    public void addTag(StoryTag s) {
      tags.add(s);
    }

    public void addVote(Vote v) {
      votes.add(v);
    }

    /** End of added by Pablo **/

    public Story(Integer _v6834, Boolean _v6835, Integer _v6836, Integer _v6837,
        java.util.ArrayList<HiddenToUser> _v6838, java.util.ArrayList<StoryTag> _v6839,
        java.util.ArrayList<Vote> _v6840) {
      super(_v6834, _v6835, _v6836, _v6837, _v6838, _v6839, _v6840);
    }
  }

  public static class _Type6793 implements java.io.Serializable {
    private Story _0;
    private java.util.ArrayList<Vote> _1;

    public Story get_0() {
      return _0;
    }

    public java.util.ArrayList<Vote> get_1() {
      return _1;
    }

    _Type6793(Story _0, java.util.ArrayList<Vote> _1) {
      this._0 = _0;
      this._1 = _1;
    }

    @Override
    public int hashCode() {
      int _hash_code6841 = 0;
      _hash_code6841 = (_hash_code6841 * 31) ^ ((_0).hashCode());
      _hash_code6841 = (_hash_code6841 * 31) ^ ((_1).hashCode());
      return _hash_code6841;
    }

    @Override
    public boolean equals(Object other) {
      if (other == null)
        return false;
      if (other == this)
        return true;
      if (!(other instanceof _Type6793))
        return false;
      _Type6793 o = (_Type6793) other;
      Boolean _v6842;
      if ((java.util.Objects.equals(this._0, o._0))) {
        _v6842 = ((this._1 == o._1));
      } else {
        _v6842 = false;
      }
      return _v6842;
    }
  }
}
